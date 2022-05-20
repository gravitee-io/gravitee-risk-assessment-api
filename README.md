# Gravitee Risk Assessment Api

ifdef::env-github[]
image:https://img.shields.io/badge/semantic--release-conventional%20commits-e10079?logo=semantic-release["Releases", link="https://github.com/gravitee-io/gravitee-risk-assessment-api/releases"]
endif::[]

## Introduction

This gravitee library contains all the necessary settings to communicate with the Gravitee Risk Assessment Service.

It is currently composed of:

- **gravitee-risk-assessment-api**: the common api to implement in your project:
  - The data model to use for settings
  - The data model to use for the evaluation data

## Installation

```bash
$ mvn clean install
```
You can then add the dependency in your pom.xml file:

```xml
<dependency>
  <groupId>io.gravitee.risk.assessment.api</groupId>
  <artifactId>gravitee-risk-assessment-api</artifactId>
  <version>${version}</version>
</dependency>
```
