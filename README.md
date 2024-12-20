This repository demonstrates a common error encountered when using Groovy's `each` method with potentially null lists.  The `BuggyGroovyEach.groovy` file shows how a `NullPointerException` occurs when passing a null list to the `each` method. The `FixedGroovyEach.groovy` file shows a safe solution using the `?` safe navigation operator and demonstrates using the `elvis` operator to provide a default value if the list is null.