{ jdk }:

{
  packageOverrides = p: {
    sbt = p.gradle.override {
      jre = p.${jdk};
    };
  };
}

