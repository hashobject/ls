# ls

Clojure one-method library. Get all files in the given directory. Similar to UNIX `ls`.

Code retried from [marginalia](https://github.com/gdeer81/marginalia/blob/master/src/marginalia/core.clj#L51) for
reuse in other projects.


## Install

```
[ls "0.1.0"]
```

## Usage

```
user=> (use 'ls.core)
nil
user=> (ls .) ; get files in the current directory
(".git" ".gitignore" ".lein-failures" ".lein-repl-history" ".travis.yml" "LICENSE" "project.clj" "README.md" "src" "target" "test")
```


## Contributions

We love contributions. Please submit your pull requests.


## License

Copyright © 2013 Hashobject Ltd (team@hashobject.com).

Distributed under the [Eclipse Public License](http://opensource.org/licenses/eclipse-1.0).


