/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.performance.util

import org.gradle.util.GradleVersion

class Git {
    static final Git INSTANCE = new Git()
    final String commitId
    final String branchName

    static Git current() {
        return INSTANCE
    }

    private Git() {
        commitId = System.getProperty("gradleBuildCommitId", GradleVersion.current().revision)
        branchName = System.getProperty("gradleBuildBranch", "unknown-branch")
    }
}
