{
  "name": "mutative",
  "version": "1.3.0",
  "description": "A JavaScript library for efficient immutable updates",
  "main": "dist/index.js",
  "module": "dist/mutative.esm.js",
  "umd:main": "dist/mutative.umd.production.min.js",
  "unpkg": "dist/mutative.umd.production.min.js",
  "jsdelivr": "dist/mutative.umd.production.min.js",
  "jsnext:main": "dist/mutative.esm.js",
  "react-native": "dist/mutative.esm.js",
  "source": "src/index.ts",
  "types": "dist/index.d.ts",
  "exports": {
    ".": {
      "import": "./dist/mutative.esm.mjs",
      "require": "./dist/index.js",
      "types": "./dist/index.d.ts"
    },
    "./*": "./*"
  },
  "files": [
    "dist",
    "src"
  ],
  "scripts": {
    "test": "jest",
    "type-check": "tsc --noEmit",
    "clean": "rimraf dist",
    "test:coverage": "jest --coverage && coveralls < coverage/lcov.info",
    "benchmark": "yarn build && yarn benchmark:base && yarn benchmark:object && yarn benchmark:array && yarn benchmark:class",
    "all-benchmark": "yarn build && NODE_ENV='production' ts-node test/benchmark/index.ts",
    "benchmark:reducer": "NODE_ENV='production' ts-node test/performance/benchmark-reducer.ts",
    "benchmark:base": "NODE_ENV='production' ts-node test/performance/benchmark.ts",
    "benchmark:object": "NODE_ENV='production' ts-node test/performance/benchmark-object.ts",
    "benchmark:array": "NODE_ENV='production' ts-node test/performance/benchmark-array.ts",
    "benchmark:class": "NODE_ENV='production' ts-node test/performan