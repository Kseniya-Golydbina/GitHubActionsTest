name: name

on: push

jobs: 
 gradle:
  strategy:
    matrix:
     os: [ubuntu-latest, macos-latest, windows-latest]
     jdk: [8, 11, 17]
  runs-on: ${{matrix.os }}
  env:
    JDK_VERSION: ${{matrix.jdk }}
