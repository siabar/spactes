#!/bin/bash
#language default value
LANG="auto" 
POSITIONAL=()
while [[ $# -gt 0 ]]
do
key="$1"

case $key in
    --input)
    INPUT="$2"
    shift # past argument
    shift # past value
    ;;
    --output)
    OUTPUT="$2"
    shift # past argument
    shift # past value
    ;;
    --param:language=*)
    LANG="${key#*=}"
    shift # past argument
    shift # past value
    ;;
    *)    # unknown option
    POSITIONAL+=("$1") # save it in an array for later
    shift # past argument
    ;;
esac
done
set -- "${POSITIONAL[@]}" # restore positional parameters

echo INPUT  = "${INPUT}"
echo OUTPUT  = "${OUTPUT}"
echo LANG    = "${LANG}"

export LD_LIBRARY_PATH=/usr/local/share/freeling/APIs/java/

export CLASSPATH="/home/siabar/eclipse-workspace/OpenMinted_Freeling/target/FreeLingWrapper-0.1-SNAPSHOT.jar":$(</home/siabar/eclipse-workspace/OpenMinted_Freeling/classPath.txt)
java -Xmx1024m -cp $CLASSPATH  edu.upf.taln.uima.freeling.FreelingXMIReaderWriter ${INPUT} ${OUTPUT} ${LANG} xmi
