# Git 명령어

## Git 로컬 컴퓨터에 사용자 등록하기

- git config --global user.name "Merhong"
- git config --global user.email "zx2938@gmail.com"

## Git 최초 시작하기

- git init
- git add .
- git commit -m "최초 커밋"

## Github 업로드하기

- git remote add origin https://github.com/Merhong/java_study.git
- git push origin master

## 다시 업로드 하는 법

- 소스코드 변경
- git add .
- git commit -m "변경내용 적기"
- git push origin main

## 잘 안될때 해결법

- git remote -v
- git remote rm origin

## Github 소스코드 다운로드 하는법
- git clone 주소