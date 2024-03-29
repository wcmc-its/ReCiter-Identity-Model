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
  "uid": "ccole",
  "primaryName": {
    "firstName": "Curtis",
    "firstInitial": "C",
    "middleName": "L",
    "middleInitial": "L",
    "lastName": "Cole"
  },
  "alternateNames": [
    {
      "firstName": "Curtis",
      "firstInitial": "C",
      "middleName": "L.",
      "middleInitial": "L",
      "lastName": "Cole"
    },
    {
      "firstName": "Curtis",
      "firstInitial": "C",
      "middleName": "Leland",
      "middleInitial": "L",
      "lastName": "Cole"
    }
  ],
  "emails": [
    "ccole@med.cornell.edu"
  ],
  "knownRelationships": [
    {
      "uid": "lgolight",
      "name": {
        "firstName": "Linnie",
        "firstInitial": "L",
        "middleName": "M",
        "middleInitial": "M",
        "lastName": "Golightly"
      },
      "type": "CO_INVESTIGATOR"
  ],
  "organizationalUnits": [
    {
      "organizationalUnitLabel": "Library",
      "organizationalUnitType": "DEPARTMENT",
      "startDate": "2010-10-01",
      "endDate": ""
    },
    {
      "organizationalUnitLabel": "Health Informatics",
      "organizationalUnitType": "DIVISION",
      "startDate": "2018-01-01",
      "endDate": "2019-02-30"
    }
  ],  
  "title": "Associate Professor of Clinical Medicine",
  "institutions": [
    "Weill Cornell Medical College, Cornell University",
    "NewYork-Presbyterian Hospital",
    "Bowdoin College",
    "Cornell University Medical College",
    "Weill Cornell Medical College"
  ],
  "degreeYear": {
    "bachelorYear": 1986,
    "doctoralYear": 1994
  },
  "personTypes": [
    "academic",
    "academic-faculty",
    "academic-faculty-weillfulltime",
    "academic-faculty-associate",
    "employee-nonacademic",
    "employee-exempt",
    "employee",
    "affiliate",
    "affiliate-nyp",
    "affiliate-nyp-weillcampus-credentialed"
  ],
  "grants": [
    "TR000457",
    "HS017029"
  ],
  "primaryEmail": "ccole@med.cornell.edu",
  "primaryOrganizationalUnit": "Medicine (Infectious Disease)"
  "primaryInstitution": "Weill Cornell Medical College, Cornell University"
}
```
