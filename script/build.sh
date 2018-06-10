#!/bin/sh -e

lein clean
rm -rf build
script/check.sh --ci-mode
script/test.sh
