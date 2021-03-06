/*
 * Copyright 2017 Lightbend, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lightbend.rp

import sbt._

package object sbtreactiveapp {
  private[rp] val rpDockerPublish = TaskKey[Unit]("rp-docker-publish")
  private[rp] val LocalApplicationConfig = "rp-application.conf"
  private[rp] val ToolingConfig = "rp-tooling.conf"

  /**
   * Bullet-proof (!) detection that we are running on Windows.
   *
   * @return true if we're running on Windows
   */
  def isWindows: Boolean = IO.Newline == "\r\n"
}
