/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.usrmrz.githubrepolist.ui.activities

import android.app.Activity
import android.os.Bundle
import dev.usrmrz.githubrepolist.R

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

  private val items = listOf(
      "JetBrains/kotlin - The Kotlin Programming Language",
      "exercism/kotlin - Exercism exercises in Kotlin",
      "cbeust/kobalt - A Kotlin-based build system for the JVM",
      "JetBrains/kotlin - The Kotlin Programming Language",
      "exercism/kotlin - Exercism exercises in Kotlin",
      "cbeust/kobalt - A Kotlin-based build system for the JVM",
      "JetBrains/kotlin - The Kotlin Programming Language"
  )

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

//    repoList.layoutManager = LinearLayoutManager(this)
//    repoList.adapter = RepoListAdapter(items)

    val url = "https://api.github.com/search/repositories?q=mario+language:kotlin&sort=stars&order=desc"
  }
}
