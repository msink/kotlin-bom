@echo off
setlocal
set "PATH=..\kotlin-native\dist\bin;%PATH%"
if not exist stdio.klib (call cinterop -def "posix\stdio.def" -o stdio || exit /b)
call konanc src/main.kt posix/file.kt -library stdio -o bom || exit /b
