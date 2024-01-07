# Event Driven Architecture

#### Objective:
* This is an attempt to demonstrate the step by step approach to create an event driven architecture. 
* I have taken a very simple use case i.e. a patient health vitals collector, monitorning, alert and dashboarding.
* I have taken a incremental approach where in I am documenting each increment and things I have done in that increment. This will help you all to follow the approaches step by step.
* Each increment I have marked with a unique git tag. You can checkout each tag to see what has been done in that increment. I have also documented the steps and things I have done in that increment.

### Increment 1: MVP-1
#### Change Log:
* Things to learn:
    * Basic Spring Boot app
    * Flyway library for DB evolution
    * Spring cloud API gateway
* Details
    * Created an spring boot api called as Health Metrics Collector API
        * A simple rest api
        * h2 DB used.
        * impl flyway migration scripts for evolving the db later.
        * Added a get and post endpoint to accept the patient vitals and save in h2 in-mem db
        * Added an api gateway component:
    * Used Spring cloud api gateway here.
        * Added the route config in the application yml.
        * These routes are configured to forward requests to our health metrics spring boot api.
