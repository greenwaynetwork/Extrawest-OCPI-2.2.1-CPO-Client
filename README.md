# Extrawest-OCPI-2.2.1-CPO-Client


![build](https://img.shields.io/github/actions/workflow/status/extrawest/Extrawest-OCPI-2.2.1-CPO-Client/docker-image.yml?style=for-the-badge)
![release](https://img.shields.io/github/v/release/extrawest/Extrawest-OCPI-2.2.1-CPO-Client?style=for-the-badge)
[![Java CI with Maven](https://github.com/extrawest/Extrawest-OCPI-2.2.1-CPO-Client/actions/workflows/release-publish.yml/badge.svg)](https://github.com/extrawest/Extrawest-OCPI-2.2.1-CPO-Client/actions/workflows/snapshot-publish.yml)
![contr](https://img.shields.io/github/contributors/extrawest/Extrawest-OCPI-2.2.1-CPO-Client?style=for-the-badge)
![commits](https://img.shields.io/github/commit-activity/m/extrawest/Extrawest-OCPI-2.2.1-CPO-Client?style=for-the-badge)
![lastcommit](https://img.shields.io/github/last-commit/extrawest/Extrawest-OCPI-2.2.1-CPO-Client?style=for-the-badge)
![OCPI](https://img.shields.io/badge/OCPI-2.2.1-yellowgreen?style=for-the-badge)
![JDK](https://img.shields.io/badge/JDK-17-yellow?style=for-the-badge)
![social](https://img.shields.io/github/forks/extrawest/Extrawest-OCPI-2.2.1-CPO-Client?style=for-the-badge)

## Table of Contents

- [Field of use](#field-of-use)
- [Description](#description)
- [Maven](#maven)
- [Requirements](#requirements)
- [Installation](#installation)
- [Getting Started](#getting-started)
- [Use in Spring Boot App](#using-extrawest-ocpi-221-cpo-client-in-spring-boot-application)
- [API Endpoints](#api-endpoints)
- [Models](#models)
- [Authentication and Authorization](#authentication-and-authorization)
- [Recommendation](#recommendation)
- [License](#license)
- [About Extrawest.com](#about-extrawestcom)

## Field of use
Client library for [OCPI CPO Server](https://github.com/extrawest/Extrawest-OCPI-2.2.1-CPO-Server). Library for OCPI eMSP can be found [here](https://github.com/extrawest/Extrawest-OCPI-2.2.1-EMSP-Client).

This API exposes endpoints to manage OCPI entities. Open Charge Point Interface (OCPI) is an open protocol used for connections between charging station operators and service providers. Simply put, this protocol facilitates automated roaming for EV drivers between different EV charging networks.

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)* as a client library for [OCPI CPO Server Library](https://github.com/extrawest/Extrawest-OCPI-2.2.1-CPO-Server)

Description
=============

With this library, you can easily get started with the Open Charge-Point Interface by making calls to OCPI CPO Server API. It is a client to OCPI CPO Server  [OCPI CPO Server Library](https://github.com/extrawest/Extrawest-OCPI-2.2.1-CPO-Server), generated by OpenAPI Generator

Please note, this is a library and not an application, so there is no main method.

Currently we support 2.2.1 OCPI version.

Maven
=====

Find the maven repo here: https://mvnrepository.com/artifact/com.extrawest/Extrawest-OCPI-2.2.1-CPO-Client

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.extrawest</groupId>
  <artifactId>Extrawest-OCPI-2.2.1-CPO-Client</artifactId>
  <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/Extrawest-OCPI-2.2.1-CPO-Client-2023.8.18.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.extrawest.ocpi.cpo.client.invoker.*;
import com.extrawest.ocpi.cpo.client.invoker.auth.*;
import com.extrawest.ocpi.cpo.client.model.*;
import com.extrawest.ocpi.cpo.client.api.ClientInfoControllerApi;

public class ClientInfoControllerApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");
        
        ClientInfoControllerApi apiInstance = new ClientInfoControllerApi(defaultClient);
        String countryCode = "countryCode_example";
        String partyId = "partyId_example";
        try {
            ClientInfoDTO result = apiInstance.getHubClientInfo(countryCode, partyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientInfoControllerApi#getHubClientInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```
### Using Extrawest-OCPI-2.2.1-CPO-Client in Spring Boot Application

1. To access the CPO API classes, we need to configure them as beans:
```java
@Configuration
public class CpoClientConfig {

    @Bean
    public CpoTariffControllerApi cpoTariffControllerApi() {
        return new CpoTariffControllerApi(apiClient());
    }

    @Bean
    public ApiClient apiClient() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://ocpi-server-api-url/");
        return apiClient;
    }
}
```

2. Since we configured our API classes as beans, we can freely inject them in our Spring-managed classes:
```java

@Service
public class CpoTariffServiceImpl implements  CpoTariffService {
    @Autowired
    private CpoTariffControllerApi cpoTariffControllerApi;

    @Override
    public List<TariffDTO> getTariffs() {
        try {
            return cpoTariffControllerApi.getTariffs(OffsetDateTime.now().minusDays(10), OffsetDateTime.now().minusDays(1), 1, 10);
        } catch (RestClientException e) {
            throw new RuntimeException();
        }
    }
}

```

Spring Boot application, where we have tested Extrawest-OCPI-2.2.1-CPO-Client, has below Spring dependencies. In case of library and your project dependencies versions incompatibility, try to add next spring versions into you projects:
```
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-web</artifactId>
            <version>5.3.24</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.3.24</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>5.3.24</version>
        </dependency>
```


## API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClientInfoApi* | [**getHubClientInfo**](docs/ClientInfoApi.md#getHubClientInfo) | **GET** /api/2.2.1/hubClientInfo/{country_code}/{party_id} |
*ClientInfoApi* | [**putHubClientInfo**](docs/ClientInfoApi.md#putHubClientInfo) | **PUT** /api/2.2.1/hubClientInfo/{country_code}/{party_id} |
*CpoCdrApi* | [**getCdr**](docs/CpoCdrApi.md#getCdr) | **GET** /cpo/api/2.2.1/cdr |
*CpoChargingProfilesApi* | [**deleteChargingProfile**](docs/CpoChargingProfilesApi.md#deleteChargingProfile) | **DELETE** /cpo/api/2.2.1/chargingProfiles/{session_id}/{response_url} |
*CpoChargingProfilesApi* | [**getChargingProfile**](docs/CpoChargingProfilesApi.md#getChargingProfile) | **GET** /cpo/api/2.2.1/chargingProfiles/{session_id}/{duration}/{response_url} |
*CpoChargingProfilesApi* | [**putChargingProfile**](docs/CpoChargingProfilesApi.md#putChargingProfile) | **PUT** /cpo/api/2.2.1/chargingProfiles/{session_id} |
*CpoCommandsApi* | [**postCommand**](docs/CpoCommandsApi.md#postCommand) | **POST** /cpo/api/2.2.1/commands/{command} |
*CpoCredentialsApi* | [**deleteCredentials**](docs/CpoCredentialsApi.md#deleteCredentials) | **DELETE** /cpo/api/2.2.1/credentials |
*CpoCredentialsApi* | [**getCredentials**](docs/CpoCredentialsApi.md#getCredentials) | **GET** /cpo/api/2.2.1/credentials |
*CpoCredentialsApi* | [**postCredentials**](docs/CpoCredentialsApi.md#postCredentials) | **POST** /cpo/api/2.2.1/credentials |
*CpoCredentialsApi* | [**putCredentials**](docs/CpoCredentialsApi.md#putCredentials) | **PUT** /cpo/api/2.2.1/credentials |
*CpoLocationApi* | [**getLocationEvseController**](docs/CpoLocationApi.md#getLocationEvseController) | **GET** /cpo/api/2.2.1/locations |
*CpoLocationApi* | [**getLocations**](docs/CpoLocationApi.md#getLocations) | **GET** /cpo/api/2.2.1/locations/getLocations |
*CpoSessionsApi* | [**getSessions**](docs/CpoSessionsApi.md#getSessions) | **GET** /cpo/api/2.2.1/sessions |
*CpoSessionsApi* | [**putChargingPreferences**](docs/CpoSessionsApi.md#putChargingPreferences) | **PUT** /cpo/api/2.2.1/sessions |
*CpoTariffApi* | [**getTariffs**](docs/CpoTariffApi.md#getTariffs) | **GET** /cpo/api/2.2.1/tariffs |
*CpoTokensApi* | [**getToken**](docs/CpoTokensApi.md#getToken) | **GET** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} |
*CpoTokensApi* | [**patchToken**](docs/CpoTokensApi.md#patchToken) | **PATCH** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} |
*CpoTokensApi* | [**putToken**](docs/CpoTokensApi.md#putToken) | **PUT** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} |
*CpoVersionApi* | [**getVersion**](docs/CpoVersionApi.md#getVersion) | **GET** /cpo/api/2.2.1/versions |
*CpoVersionApi* | [**getVersionDetails**](docs/CpoVersionApi.md#getVersionDetails) | **GET** /cpo/api/2.2.1/versions/details/{version} |
*HubClientInfoApi* | [**getClientInfoList**](docs/HubClientInfoApi.md#getClientInfoList) | **GET** /hub/api/2.2.1/hubClientInfo/{date_from}/{date_to}/{offset}/{limit} |


## Models

- [AbstractCommand](docs/AbstractCommand.md)
- [AdditionalGeoLocation](docs/AdditionalGeoLocation.md)
- [BusinessDetails](docs/BusinessDetails.md)
- [CdrDTO](docs/CdrDTO.md)
- [CdrDimension](docs/CdrDimension.md)
- [CdrLocation](docs/CdrLocation.md)
- [CdrToken](docs/CdrToken.md)
- [ChargingPeriod](docs/ChargingPeriod.md)
- [ChargingPreferencesDTO](docs/ChargingPreferencesDTO.md)
- [ChargingProfile](docs/ChargingProfile.md)
- [ChargingProfilePeriod](docs/ChargingProfilePeriod.md)
- [ChargingProfileResponseDTO](docs/ChargingProfileResponseDTO.md)
- [ClientInfoDTO](docs/ClientInfoDTO.md)
- [CommandResponseDTO](docs/CommandResponseDTO.md)
- [Connector](docs/Connector.md)
- [CredentialsDTO](docs/CredentialsDTO.md)
- [CredentialsRole](docs/CredentialsRole.md)
- [DisplayText](docs/DisplayText.md)
- [EVSE](docs/EVSE.md)
- [Endpoint](docs/Endpoint.md)
- [EnergyContract](docs/EnergyContract.md)
- [EnergyMix](docs/EnergyMix.md)
- [EnergySource](docs/EnergySource.md)
- [EnvironmentalImpact](docs/EnvironmentalImpact.md)
- [ExceptionalPeriod](docs/ExceptionalPeriod.md)
- [GeoLocation](docs/GeoLocation.md)
- [Hours](docs/Hours.md)
- [Image](docs/Image.md)
- [LocationDTO](docs/LocationDTO.md)
- [Price](docs/Price.md)
- [PriceComponent](docs/PriceComponent.md)
- [PublishTokenType](docs/PublishTokenType.md)
- [RegularHours](docs/RegularHours.md)
- [SessionDTO](docs/SessionDTO.md)
- [SetChargingProfileRequestDTO](docs/SetChargingProfileRequestDTO.md)
- [SignedData](docs/SignedData.md)
- [SignedValue](docs/SignedValue.md)
- [StatusSchedule](docs/StatusSchedule.md)
- [Tariff](docs/Tariff.md)
- [TariffDTO](docs/TariffDTO.md)
- [TariffElement](docs/TariffElement.md)
- [TariffRestrictions](docs/TariffRestrictions.md)
- [TokenDTO](docs/TokenDTO.md)
- [VersionDetailsResponseDTO](docs/VersionDetailsResponseDTO.md)
- [VersionResponseDTO](docs/VersionResponseDTO.md)


## Authentication and Authorization
All endpoints do not require authorization or authentication.

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## License


[MIT License](LICENSE)

## About Extrawest.com


We are devoted to push the marked for vehicles charging forward.
There are many standards out there, we intend to implement and share them. Any help is much appreciated!

The market is in its defining state, the practices and standards we come up with now, may very well stick around for decades to come.

See our vision at https://www.extrawest.com/
