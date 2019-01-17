# ReCiter-Identity-Model
ReCiter-Identity-Model

![Build Status](https://codebuild.us-east-1.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoiTi9IZ1IvQUpKcnRmTEpqWDVwWVEzOTF1TUZVd3A2OGVHL0pDMm1rUTZ6L1ZzY0tRVGNmSklza0kxZGRHRkZiMUtyVHR0WG90TlBXcGZsd3pvMU9qUGdzPSIsIml2UGFyYW1ldGVyU3BlYyI6IkwxaG1jM2RkOVNYM1ovL24iLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/edu.cornell.weill.reciter/reciter-identity-model/badge.svg)](https://maven-badges.herokuapp.com/maven-central/edu.cornell.weill.reciter/reciter-identity-model)
[![GitHub version](https://badge.fury.io/gh/wcmc-its%2FReCiter-Identity-Model.svg)](https://badge.fury.io/gh/wcmc-its%2FReCiter-Identity-Model)
[![codebeat badge](https://codebeat.co/badges/f51a9e0a-c278-490c-9d64-4d4421a1c88c)](https://codebeat.co/projects/github-com-wcmc-its-reciter-identity-model-master)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![Pending Pull-Requests](http://githubbadges.herokuapp.com/wcmc-its/ReCiter-Identity-Model/pulls.svg?style=flat)](https://github.com/wcmc-its/ReCiter-Identity-Model/pulls)
[![Open Issues](http://githubbadges.herokuapp.com/wcmc-its/ReCiter-Identity-Model/issues.svg?style=flat)](https://github.com/wcmc-its/ReCiter-Identity-Model/issues)
[![star this repo](http://githubbadges.com/star.svg?user=wcmc-its&repo=ReCiter-Identity-Model&style=flat)](https://github.com/wcmc-its/ReCiter-Identity-Model)
[![fork this repo](http://githubbadges.com/fork.svg?user=wcmc-its&repo=ReCiter-Identity-Model&style=flat)](https://github.com/wcmc-its/ReCiter-Identity-Model/fork)
[![Github All Releases](https://img.shields.io/github/downloads/wcmc-its/ReCiter-Identity-Model/total.svg)]()
[![Open Source Love](https://badges.frapsoft.com/os/v3/open-source.svg?v=102)](https://github.com/wcmc-its/ReCiter-Identity-Model/) 



## Data model

The following is a sample record from DynamoDB for the Identity table.

```
{
  "identity": {
    "alternateNames": [
      {
        "firstInitial": "P",
        "firstName": "Paul",
        "lastName": "Albert",
        "middleInitial": "J",
        "middleName": "J."
      },
      {
        "firstInitial": "P",
        "firstName": "Paul",
        "lastName": "Albert"
      }
    ],
    "degreeYear": {
      "bachelorYear": 1997,
      "doctoralYear": 0
    },
    "emails": [
      "paa2013@med.cornell.edu",
      "palbert1@gmail.com"
    ],
    "grants": [
      "RR029822"
    ],
    "institutions": [
      "Colgate University",
      "Weill Cornell Medical College, Cornell University",
      "Columbia University, Teachers College",
      "Pratt Institute"
    ],
    "knownRelationships": [
      {
        "name": {
          "firstInitial": "G",
          "firstName": "Grace",
          "lastName": "Migliorisi"
        },
        "type": "Co-investigator",
        "uid": "grm2001"
      },
      {
        "name": {
          "firstInitial": "J",
          "firstName": "Jesse",
          "lastName": "Turner",
          "middleInitial": "C",
          "middleName": "C"
        },
        "type": "Co-investigator",
        "uid": "jet2013"
      },
      {
        "name": {
          "firstInitial": "J",
          "firstName": "John",
          "lastName": "Ruffing"
        },
        "type": "Co-investigator",
        "uid": "jruffing"
      },
      {
        "name": {
          "firstInitial": "R",
          "firstName": "Richard",
          "lastName": "Hu"
        },
        "type": "Co-investigator",
        "uid": "huh2009"
      },
      {
        "name": {
          "firstInitial": "M",
          "firstName": "Mark",
          "lastName": "Bronnimann"
        },
        "type": "Co-investigator",
        "uid": "meb2001"
      },
      {
        "name": {
          "firstInitial": "E",
          "firstName": "Eliza",
          "lastName": "Chan"
        },
        "type": "Co-investigator",
        "uid": "elc2013"
      },
      {
        "name": {
          "firstInitial": "D",
          "firstName": "Dan",
          "lastName": "Dickinson"
        },
        "type": "Co-investigator",
        "uid": "dwd2001"
      },
      {
        "name": {
          "firstInitial": "C",
          "firstName": "Curtis",
          "lastName": "Cole",
          "middleInitial": "L",
          "middleName": "L"
        },
        "type": "Co-investigator",
        "uid": "ccole"
      },
      {
        "name": {
          "firstInitial": "K",
          "firstName": "Kenneth",
          "lastName": "Lee"
        },
        "type": "Co-investigator",
        "uid": "kel2011"
      },
      {
        "name": {
          "firstInitial": "V",
          "firstName": "Victor",
          "lastName": "Brodsky"
        },
        "type": "Co-investigator",
        "uid": "vib9020"
      },
      {
        "name": {
          "firstInitial": "P",
          "firstName": "Peter",
          "lastName": "Michielini",
          "middleInitial": "C",
          "middleName": "C"
        },
        "type": "Co-investigator",
        "uid": "pem2010"
      },
      {
        "name": {
          "firstInitial": "T",
          "firstName": "Terrie",
          "lastName": "Wheeler",
          "middleInitial": "R",
          "middleName": "Rose"
        },
        "type": "Manager",
        "uid": "tew2004"
      },
      {
        "name": {
          "firstInitial": "M",
          "firstName": "Mark",
          "lastName": "Stasiak"
        },
        "type": "Shared organizational unit",
        "uid": "mas2178"
      },
      {
        "name": {
          "firstInitial": "M",
          "firstName": "Michelle",
          "lastName": "Demetres"
        },
        "type": "Shared organizational unit",
        "uid": "mrd2006"
      },
      {
        "name": {
          "firstInitial": "S",
          "firstName": "Shauntae",
          "lastName": "Alexander"
        },
        "type": "Shared organizational unit",
        "uid": "shb2002"
      },
      {
        "name": {
          "firstInitial": "A",
          "firstName": "Angela",
          "lastName": "Reyes"
        },
        "type": "Shared organizational unit",
        "uid": "anr2010"
      },
      {
        "name": {
          "firstInitial": "J",
          "firstName": "Juan",
          "lastName": "Ortiz troncoso"
        },
        "type": "Shared organizational unit",
        "uid": "juo3001"
      },
      {
        "name": {
          "firstInitial": "C",
          "firstName": "Colleen",
          "lastName": "Cuddy"
        },
        "type": "Shared organizational unit",
        "uid": "czc2003"
      },
      {
        "name": {
          "firstInitial": "R",
          "firstName": "Ronald",
          "lastName": "Phillips",
          "middleInitial": "C",
          "middleName": "C."
        },
        "type": "Shared organizational unit",
        "uid": "rcphilli"
      },
      {
        "name": {
          "firstInitial": "R",
          "firstName": "Raul",
          "lastName": "Padilla"
        },
        "type": "Shared organizational unit",
        "uid": "rap2022"
      },
      {
        "name": {
          "firstInitial": "L",
          "firstName": "Lyubov",
          "lastName": "Tmanova",
          "middleInitial": "L",
          "middleName": "L"
        },
        "type": "Shared organizational unit",
        "uid": "lyt2002"
      },
      {
        "name": {
          "firstInitial": "K",
          "firstName": "Kevin",
          "lastName": "Pain",
          "middleInitial": "J",
          "middleName": "J."
        },
        "type": "Shared organizational unit",
        "uid": "kjpain"
      },
      {
        "name": {
          "firstInitial": "D",
          "firstName": "Daina",
          "lastName": "Bouquin"
        },
        "type": "Shared organizational unit",
        "uid": "dab2058"
      },
      {
        "name": {
          "firstInitial": "P",
          "firstName": "Peter",
          "lastName": "Oxley",
          "middleInitial": "R",
          "middleName": "Robert"
        },
        "type": "Shared organizational unit",
        "uid": "pro2004"
      },
      {
        "name": {
          "firstInitial": "R",
          "firstName": "Rachel",
          "lastName": "Williamson",
          "middleInitial": "L",
          "middleName": "L."
        },
        "type": "Shared organizational unit",
        "uid": "raw2004"
      },
      {
        "name": {
          "firstInitial": "K",
          "firstName": "Kenneth",
          "lastName": "Watson",
          "middleInitial": "L",
          "middleName": "L."
        },
        "type": "Shared organizational unit",
        "uid": "klw2003"
      },
      {
        "name": {
          "firstInitial": "D",
          "firstName": "Donald",
          "lastName": "Lasorsa"
        },
        "type": "Shared organizational unit",
        "uid": "dol4001"
      },
      {
        "name": {
          "firstInitial": "L",
          "firstName": "Loretta",
          "lastName": "Merlo"
        },
        "type": "Shared organizational unit",
        "uid": "lamerlo"
      },
      {
        "name": {
          "firstInitial": "J",
          "firstName": "Jie",
          "lastName": "Lin"
        },
        "type": "Shared organizational unit",
        "uid": "jil3004"
      },
      {
        "name": {
          "firstInitial": "A",
          "firstName": "Alice",
          "lastName": "Chin"
        },
        "type": "Shared organizational unit",
        "uid": "alc2054"
      },
      {
        "name": {
          "firstInitial": "A",
          "firstName": "Allison",
          "lastName": "Piazza"
        },
        "type": "Shared organizational unit",
        "uid": "alp7016"
      },
      {
        "name": {
          "firstInitial": "O",
          "firstName": "Olaniyi",
          "lastName": "Olaleye"
        },
        "type": "Shared organizational unit",
        "uid": "olo2008"
      },
      {
        "name": {
          "firstInitial": "T",
          "firstName": "Theresa",
          "lastName": "Watkins"
        },
        "type": "Shared organizational unit",
        "uid": "thw2002"
      },
      {
        "name": {
          "firstInitial": "J",
          "firstName": "Jean",
          "lastName": "Policard",
          "middleInitial": "R",
          "middleName": "R"
        },
        "type": "Shared organizational unit",
        "uid": "jpolicar"
      },
      {
        "name": {
          "firstInitial": "E",
          "firstName": "Erik",
          "lastName": "Siu"
        },
        "type": "Shared organizational unit",
        "uid": "ers2003"
      },
      {
        "name": {
          "firstInitial": "D",
          "firstName": "Danita",
          "lastName": "Norville"
        },
        "type": "Shared organizational unit",
        "uid": "ddefreit"
      },
      {
        "name": {
          "firstInitial": "D",
          "firstName": "Drew",
          "lastName": "Wright"
        },
        "type": "Shared organizational unit",
        "uid": "drw2004"
      },
      {
        "name": {
          "firstInitial": "W",
          "firstName": "William",
          "lastName": "Fisk",
          "middleInitial": "R",
          "middleName": "R."
        },
        "type": "Shared organizational unit",
        "uid": "wrfisk"
      },
      {
        "name": {
          "firstInitial": "S",
          "firstName": "Sherisse",
          "lastName": "Brown"
        },
        "type": "Shared organizational unit",
        "uid": "sbrown"
      },
      {
        "name": {
          "firstInitial": "B",
          "firstName": "Becky",
          "lastName": "Baltich nelson"
        },
        "type": "Shared organizational unit",
        "uid": "blb2008"
      },
      {
        "name": {
          "firstInitial": "D",
          "firstName": "Diana",
          "lastName": "Delgado"
        },
        "type": "Shared organizational unit",
        "uid": "did2005"
      },
      {
        "name": {
          "firstInitial": "J",
          "firstName": "Joshua",
          "lastName": "Richardson",
          "middleInitial": "E",
          "middleName": "E."
        },
        "type": "Shared organizational unit",
        "uid": "jor2032"
      },
      {
        "name": {
          "firstInitial": "L",
          "firstName": "Lisa",
          "lastName": "Mix"
        },
        "type": "Shared organizational unit",
        "uid": "lim2026"
      },
      {
        "name": {
          "firstInitial": "T",
          "firstName": "Terrie",
          "lastName": "Wheeler",
          "middleInitial": "R",
          "middleName": "Rose"
        },
        "type": "Shared organizational unit",
        "uid": "tew2004"
      },
      {
        "name": {
          "firstInitial": "L",
          "firstName": "Leonid",
          "lastName": "Bukhatetsky"
        },
        "type": "Shared organizational unit",
        "uid": "leb2008"
      },
      {
        "name": {
          "firstInitial": "A",
          "firstName": "Anna",
          "lastName": "Opryszko"
        },
        "type": "Shared organizational unit",
        "uid": "alo2011"
      },
      {
        "name": {
          "firstInitial": "M",
          "firstName": "Michael",
          "lastName": "Bales",
          "middleInitial": "E",
          "middleName": "Eliot"
        },
        "type": "Shared organizational unit",
        "uid": "meb7002"
      },
      {
        "name": {
          "firstInitial": "S",
          "firstName": "Shelia",
          "lastName": "Sinclair",
          "middleInitial": "J",
          "middleName": "J."
        },
        "type": "Shared organizational unit",
        "uid": "sjs2007"
      },
      {
        "name": {
          "firstInitial": "E",
          "firstName": "Edsel",
          "lastName": "Watkins"
        },
        "type": "Shared organizational unit",
        "uid": "ewatkins"
      }
    ],
    "organizationalUnits": [
      {
        "organizationalUnitLabel": "Library",
        "organizationalUnitType": "DEPARTMENT"
      },
      {
        "organizationalUnitLabel": "Library",
        "organizationalUnitType": "DEPARTMENT"
      }
    ],
    "personTypes": [
      "academic",
      "academic-faculty",
      "academic-faculty-associate",
      "academic-faculty-weillfulltime",
      "employee-academic",
      "employee-exempt",
      "employee",
      "affiliate",
      "affiliate-federated",
      "affiliate-federated-affiliate"
    ],
    "primaryName": {
      "firstInitial": "P",
      "firstName": "Paul",
      "lastName": "Albert",
      "middleInitial": "J",
      "middleName": "J"
    },
    "pubMedAlias": [],
    "title": "Associate Librarian",
    "uid": "paa2013"
  },
  "uid": "paa2013"
}
```
