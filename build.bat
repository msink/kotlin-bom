@echo off
setlocal
set "PATH=..\kotlin-native\dist\bin;%PATH%"
call konanc src/main.kt posix/file.kt -o bom
