warn("More than 15 added/modified files") if (git.added_files.length() + git.modified_files.length()) > 15
warn("More than 300 changed lines of code") if git.lines_of_code > 300

kotlin_detekt.skip_gradle_task = true
kotlin_detekt.report_file = "build/reports/detekt/detekt.xml"
kotlin_detekt.detekt(inline_mode: true)

android_lint.skip_gradle_task = true
android_lint.report_file = "app/build/reports/lint-results-debug.xml"
android_lint.lint(inline_mode: true)
