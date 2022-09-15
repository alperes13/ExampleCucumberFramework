Feature: Validate Summary

  Scenario Outline:
    Given User navigate to wikipedia
    When User search for "<value>" and click search button
    Then User must to see "<value2>" in summary

    Examples:
      | value      | value2     |
      | javascript | javascript |
      | java       | java       |
      | python     | wrongValue |