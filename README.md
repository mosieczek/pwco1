Instrukcja budowania aplikacji bez pobierania:

1. Należy użyć polecenia "docker build https://github.com/mosieczek/pwco1.git -t nazwa kontenera".
2. Następnie aby uruchomić obraz proszę użyć polecenia "docker run -p 8002:8000 <IMAGE ID>".
3. Po uruchomieniu obrazu proszę połączyć się z adresem http://localhost:8002/.