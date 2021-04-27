<#This function will encode your file#>
<#

   Example: Get-Encodefile -pathSrc "C:\Users\Eli\Desktop\testnow.zip" -encodetime 3 -pathDst "C:\Users\Eli\Desktop\blabla.zip.b64"
#>
function Get-Encodefile{
    [CmdletBinding()]
    Param(
        [Parameter(Mandatory = $False)]
        [int]
        $encodetime = 1,

        [Parameter(Mandatory = $True)]
        [String]
        $pathSrc,

        [Parameter(Mandatory = $True)]
        [String]
        $pathDst,

        [Parameter(Mandatory = $False)]
        [String]
        $out
    )
    $encoding = [System.Text.Encoding]::ASCII
    $bytes = [System.IO.File]::ReadAllBytes($pathSrc)
    for($i=0;$i -le $encodetime;$i++){
        Write-Host "[+] Iteration number " + $i
        $B64String = [System.Convert]::ToBase64String($bytes, [System.Base64FormattingOptions]::None)
        $bytes = [System.Text.Encoding]::Unicode.GetBytes($B64String)
    }
    [System.IO.File]::WriteAllText($pathDst, $B64String, $encoding)
    Write-Host "[*] File created in the path: " + $pathDst 

}


<#This function will decode your file#>

<#

   Example: Get-Decodefile -pathSrc "C:\Users\Eli\Desktop\blabla.zip.ggg" -decodetime 6  -out "lala.zip"

#>
function Get-Decodefile{
    [CmdletBinding()]
    Param(
        [Parameter(Mandatory = $False)]
        [int]
        $decodetime = 1,

        [Parameter(Mandatory = $True)]
        [String]
        $pathSrc,

        [Parameter(Mandatory = $False)]
        [String]
        $pathDst,

        [Parameter(Mandatory = $True)]
        [String]
        $out
    )
    $encoding = [System.Text.Encoding]::ASCII
    if(!$encoding){Write-Host "The encoding parameter is Null"}
    $B64String = [System.IO.File]::ReadAllText($pathSrc, $encoding)
    $bytes = [System.Text.Encoding]::unicode.GetString([System.Convert]::FromBase64String($B64String))
    Write-Host "[+] Iteration number 1"
    for($i=0;$i -le $decodetime -1;$i++){
       if($i -eq $decodetime -1){
            $bytes = [System.Convert]::FromBase64String($bytes)
            
       }
       else
       {
           $temp = $bytes
           $bytes = [System.Text.Encoding]::unicode.GetString([System.Convert]::FromBase64String($temp))
       }
       Write-Host "[+] Iteration number " + ($i+2)
    }
    
    $pathDst = Get-Location
    $pathDst = $pathDst + "\" + $out
    [System.IO.File]::WriteAllText($pathDst, $byte, $encoding) 
    Set-Content $pathDst -Value $bytes -Encoding  Byte
}







