# ImpactInstaller

**ImpactInstaller** is an installer program for
[Impact](https://impactdevelopment.github.io) based on [LiteLoaderInstaller](https://github.com/Mumfrey/LiteLoaderInstaller) which, in turn, was origionally built upon the
[Minecraft Forge Installer](https://github.com/MinecraftForge/Installer).

![Screenshot](docs/screenshot.jpg?raw=true)

### Building the project
**ImpactInstaller** uses the [Gradle](http://gradle.org/) build automation
system. It is designed to be built alongside the LiteLoader project, and
requires that the upstream artefact is specified using the `upstreamJar` project
property. The property will be evaluated with `x` being substituted for the
target `project` object, so for example you may use:

```
gradle -P-PupstreamJar='"${x.projectDir}/../LiteLoader/build/libs/liteloader-${x.mcversion}-SNAPSHOT-release.jar"'
```
