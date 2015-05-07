Just run `make`.

The main point for now is the `TurboFilter` usage, see logback.xml and the example output:

```
java Playground logback.xml
Welcome to playground
15:33:40.085 [main] INFO  Playground - i=0, main=running - Foo func accomplished
15:33:40.087 [main] INFO  Playground - i=1, main=running - Foo func accomplished
15:33:40.087 [main] DEBUG Playground - i=2, main=running - Starting foo func
15:33:40.087 [main] TRACE Playground - i=2, main=running - Kinda tracing the foo func, i: 2
15:33:40.089 [main] INFO  Playground - i=2, main=running - Foo func accomplished
15:33:40.089 [main] INFO  Playground - main=running - Main func accomplished
15:33:40.090 [main] ERROR Playground - main=running - About to shutdown
```
