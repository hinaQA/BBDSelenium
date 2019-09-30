#Author:Hina Maheshwari



Feature: Verify that user can upload video on youtube

  Scenario: Upload video on youTube
    Given Login using gmail account
    When Go to upload video section
    And Upload a video
    Then Verify that video is uploaded 