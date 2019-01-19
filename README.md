# ReCiter-Identity-Model

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
          "firstInitial": "T",
          "firstName": "Terrie",
          "lastName": "Wheeler",
          "middleInitial": "R",
          "middleName": "Rose"
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
