@Asha @Sanity @Smoke @Regression
Feature: Job Search Test Feature
  As a User,
  I would like to perform Job search results using different datasets
# # 1.verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin,
# String salaryMax, String salaryType, String jobType, String result).
# * enter job title 'jobTitle'
# * enter Location 'location'
# * select distance 'distance'
# * click on moreSearchOptionsLink
# * enter salaryMin 'salaryMin'
# * enter salaryMax 'salaryMax'
# * select salaryType 'salaryType'
# * select jobType 'jobType'
# * click on 'Find Jobs' button
# * verify the result 'result'

  Scenario Outline: User Verify Job Search Result Using Different DataSet
    Given     User is on Homepage
    When      User enter job title "<jobTitle>"
    And       User enter Location "<location>"
    And       User select distance "<distance>"
    And       User click on more Search Options Link
    And       User enter salaryMin "<salaryMin>"
    And       User enter salaryMax "<salaryMax>"
    And       User select salaryType "<salaryType>"
    And       User select jobType "<jobType>"
    And       User click on Find Jobs button
    Then      User verify the result "<result>"
    Examples:
      | jobTitle          | location        | distance | salaryMin | salaryMax | salaryType | jobType   | result                                               |
      | Tester            | Harrow          | 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Tester jobs in Harrow                      |
      | Scrum Master      | London          | 10 miles | 70000     | 80000     | Per annum  | Permanent | Permanent Scrum Master jobs in London                |
      | Test Manager      | Southampton     | 5 miles  | 70000     | 80000     | Per annum  | Permanent | Permanent Test Manager jobs in Southampton           |
      | IT Developer      | Birmingham      | 10 miles | 40000     | 60000     | Per annum  | Permanent | Permanent It Developer jobs in Birmingham            |
      | Automation Tester | Bristol(County) | 15 miles | 40000     | 50000     | Per annum  | Permanent | Permanent Automation Tester jobs in Bristol (County) |
      | Business analyst  | Cardiff         | 10 miles | 30000     | 60000     | Per annum  | Permanent | Permanent Business Analyst jobs in Cardiff           |
