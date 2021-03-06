@echo off
setlocal
set "PATH=\work\.konan\kotlin-native-prebuilt-windows-1.4.10\bin;%PATH%"
call konanc -target mingw_x86 src\common\kotlin src\native\kotlin -o out\bom || exit /b

pushd out
\cygwin64\bin\iconv -f UTF-8 -t CP1251 ..\README.md | \cygwin64\bin\tail -n +5 > README.txt
7z a bom.zip bom.exe README.txt ..\src\common\GOST_B.TTF ..\test\M2-KLP1.bom ..\test\M2-KLP1.txt
popd
