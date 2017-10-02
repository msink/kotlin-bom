@echo off
setlocal
set "PATH=..\kotlin-native\dist\bin;%PATH%"
if not exist out\stdio.klib (call cinterop -def "src\native\c_interop\stdio.def" -o out\stdio || exit /b)
call konanc src/common/kotlin src/native/kotlin -library out\stdio -o out\bom || exit /b
