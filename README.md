# Gravitee Risk Assessment Api

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
