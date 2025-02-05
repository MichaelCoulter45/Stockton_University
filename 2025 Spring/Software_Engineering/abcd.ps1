$server = "localhost"
$database = "mysql"
$username = "root"
$password = "mysql"

$connectionString = "server=$server;port=3306;uid=$username;pwd=$password;database=$database;"
try{
    $connection = New-Object MySql.Data.MySqlClient.MySqlConnection
    $connection.ConnectionString = $connectionString
    $connection.Open()
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