#!/bin/bash
#this bash is to store the correct command to run the docker (from outside the docker ;-) 
docker pull taln/openminted_freeling
docker run -v /home/siabar/Documents/OpenMinted_Freeling/input:/input -v /home/siabar/Documents/OpenMinted_Freeling/output:/output --name openminted_freeling taln/openminted_freeling 

#docker run -v /var/data/openminted/input:/home/siabar/Documents/OpenMinted_Freeling/input -v /var/data/openminted/output:/home/siabar/Documents/OpenMinted_Freeling/output taln/openminted_freeling 
