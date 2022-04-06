{ jdk ? "jdk11" }:

let
  pkgs = import nix/pkgs.nix { inherit jdk; };
in
  pkgs.mkShell {
    buildInputs = [
      pkgs.gradle
      pkgs.${jdk}
      pkgs.kotlin
    ];
  }

