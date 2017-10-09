@echo off
setlocal
set "PATH=..\kotlin-native\dist\bin;%PATH%"
if not exist out\stdio.klib (call cinterop -def "src\native\c_interop\stdio.def" -o out\stdio || exit /b)
call konanc src/common/kotlin src/native/kotlin -library out\stdio -o out\bom || exit /b

pushd out
\cygwin64\bin\iconv -f UTF-8 -t CP1251 ..\README.md | \cygwin64\bin\tail -n +5 > README.txt
7z a bom.zip bom.exe README.txt ..\src\common\GOST_B.TTF ..\test\M2-KLP1.bom ..\test\M2-KLP1.txt
popd
