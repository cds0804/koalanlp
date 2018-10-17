#!/usr/bin/env bash

JAR_VER=$(cat gradle.properties | grep "version=" | cut -d= -f2 | cut -d- -f1)
DATE=`date +%D`

./gradlew githubMarkdownDoc
git add docs/api
git commit -a -m "Documentation of v$JAR_VER at $DATE"