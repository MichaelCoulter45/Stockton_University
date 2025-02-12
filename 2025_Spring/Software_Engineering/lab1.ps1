
[void][System.Reflection.Assembly]::LoadFrom(“C:\Program Files (x86)\MySQL\MySQL Connector NET 9.2\MySql.Data.dll”);
#Set-Variable path "C:\Program Files\Ampps\mysql\data"
$server = "localhost"
$database = "mysql"
$username = "root"
$password = "mysql"

$connectionString = "server=$server;port=3306;uid=$username;pwd=$password;database=$database;"
try{
    $myconnection = New-Object MySql.Data.MySqlClient.MySqlConnection
    $myconnection.ConnectionString = $connectionString
    $myconnection.Open()
    if($connection.State -eq [System.Data.ConnectionState]::Open){
        Write-Host "Connection Successful"
    }
    else{
        Write-Host "Connection Failed"
    }
}
catch{
    Write-Host "Error: $($_.Exception.Message)"
}
$mycommand = New-Object MySql.Data.MySqlClient.MySqlCommand
$mycommand.Connection = $myconnection
$mycommand.CommandText = “SHOW TABLES”
$myreader = $mycommand.ExecuteReader()
while($myreader.Read()) { $myreader.GetString(0) }
$myconnection.Close()