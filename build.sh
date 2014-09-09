#!/bin/sh
# 
# A simple script for building source code by using ant with color :D
#
# @author Mond Wan

# Testrunner we used
ANT=$(which ant)

# Default arguments on calling `ant`
ANT_ARGS='-logger org.apache.tools.ant.listener.AnsiColorLogger'

# Always clean up first
${ANT} ${ANT_ARGS} clean

# Determind running tdd or not
#if [ "$1" == "tdd" ]; then
if [ "$1" = "tdd" ]; then
    ant -lib /usr/share/ant/lib/ -logger org.apache.tools.ant.listener.AnsiColorLogger tdd
else
    ant -logger org.apache.tools.ant.listener.AnsiColorLogger main
fi
