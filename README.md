
# Apache SpaCTeS-cTAKES


## Introduction

We have implemented a clinical text-processing tool for Spanish and Catalan EHRs (Electronic Health Records). 
This tool, the first in Spanish for neuroscientific purposes, was used to process a collection of anonymized 
discharge reports collected through a network that integrates 46 Catalan hospitals. The interoperability 
between these different health systems relied on the HC3 (Shared Clinical History of Catalonia) data model. 
The tool was primarily developed to assist human experts in the process of systematically evaluating 
hospital care for patients with a diagnosis of stroke.
The tool (named SpaCTeS) is a pipeline that integrates software components performing the following operations: 
(1) basic PDF pre-processing and conversion into plain text, 
(2) clinical document standardization and section identification, 
(3) automatic language detection to distinguish between Spanish and Catalan texts, 
(4) sentence splitting and tokenization (Freeling), 
(5) PoS tagging and lemmatization (Freeling), 
(6) temporal tagging (HeidelTime), 
(7) semantic tagging of clinical entity mentions with focus on SNOMED semantic tags for disorders, 
procedures, findings, body structures, substances and organisms (Fuzzy Dictionary lookup), 
(8) clinical entity grounding system for linking clinical mentions to relevant temporal tags. 

The first version of our tool is available which is included these three components for the Spanish language:

1) **FREELING** (Padro and Stanilovsky, 2012) is a C++ library providing language analysis functionalities 
(Morphological Analysis, Named Entity Detection, PoS-Tagging, Parsing, Word Sense Disambiguation, 
Semantic Role Labelling, so forth) for a variety of languages. FREELING can be integrated into UIMA 
using a wrapper and a dockerized version of Freeling that was developed during [the OpenMinTeD project](https://openminted.bsc.es).

2) **HEIDELTIME** (Strotgen and Gertz, 2010) is a multilingual, domain-sensitive temporal tagger that extracts 
temporal expressions from documents and normalizes them according to the TIMEX3 annotation standard.

3) **FUZZY DICTIONARY LOOKUP** identifies terms in the text and normalizes them to codes in a given ontology. 
This component is based on the Fast Dictionary lookup of cTAKES. Although the lookup algorithm has been changed completely.
The Fast Dictionary Lookup component of cTAKES is strict to finding the matched words in the dictionary/lexicon, 
and therefore if in the input’s EHR we have typos or missed tokens, 
the fast dictionary lookup component could not detect these tokens.

Input is a text file and output is XML(Readble by UIMA CVS), BRAT or HTML files.

**We integrated all of these components into cTAKES as native components.**


## Requirements

After clone [cTAKES](https://github.com/apache/ctakes) in your local repository
Change pom of cTAKES directory with the current one and add all new modules (Freeling, HeidelTime, SpellCheker, 
Fuzzy Dictionary Lookup and SpaCTeS) to the cTAKES directory.

Following User Install Guide of:
1. [**cTAKES**](https://cwiki.apache.org/confluence/display/CTAKES/cTAKES+4.0+User+Install+Guide).

2. [**Freeling**](https://github.com/TALP-UPC/FreeLing-User-Manual) or [**Freeling Wrapper**](https://github.com/TalnUPF/OpenMinted_Freeling) [Recommended].
We installed Freeling V 4.0.



## Contact
Siamak Barzegar (siamak.barzegar@bsc.es)

## Licence

Apache License

