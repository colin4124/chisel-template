# chisel-template

This project template uses [Mill](http://www.lihaoyi.com/mill/index.html) as build tools. 

It demonstrates how to build chisel3 code to verilog.

```shell
$ mill template.run -td builds
```

It will generate verilog files in `builds` directory.

## Usage Offline

Rename `build.offline` to `build.sc`, then make `lib` directory and download [chisel3-3.2.2](https://github.com/colin4124/chisel3-releases/releases/download/chisel3-3.2.2/chisel3-3.2.2.jar) in `lib`.

```shell
$ mv build.offline build.sc
$ mkdir lib
$ cd lib
$ wget https://github.com/colin4124/chisel3-releases/releases/download/chisel3-3.2.2/chisel3-3.2.2.jar
$ cd ..
$  mill template.run -td builds
```

