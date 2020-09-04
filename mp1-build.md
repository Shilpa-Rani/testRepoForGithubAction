1. Set up a basic maven(using Spring boot and Junit dependencies) project locally.
2. Expose a couple of REST APIs and added a Junit Test.
3. Compiled it and see if tests are passing. Then, accessed the localhost:8080 to see if we can get expected values.
4. Made changes to cross-verify that the tests are failing now, if I make some incoherent changes.
5. Pushed this to https://github.com/Shilpa-Rani/testRepoForGithubAction to
6. Go to the actions tab. Chose Java sample workflow. It created .github/workflows dir.
7. created a file github-actions.yml.
8. Added a step - mvn test
9. Tested the success scenario - when the test would pass, and thus the build with a green-tick.
10. Pushed the code with failed tests and the build failed with a red mark.

11. Went ahead to integrate this with Heroku, where setup a pipeline, that will deploy the build if it's a successful build.

Options explored - 
1. Jenkins, Travis CI, Circle CI. Chose github-actions because it did not require any 3rd-party integration.
2. We can also wrap our application as a container (docker credentials can be stored as github-secrets) and push it a registry like docker, quay etc.
3. I also discovered that there is keel operator or Flux operator. This can keep a check on the container registry and if there are any changes it will deploy these new pushed services as containers in the kubernetes clusters. The label mentioned in deployment.yaml of the applications helps to decide various parameters of the deployment.
