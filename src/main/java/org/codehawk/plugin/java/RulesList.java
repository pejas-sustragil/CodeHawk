/*
 * CodeHawk plugin
 * Copyright (C) 2016-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.codehawk.plugin.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.codehawk.plugin.java.checks.AvoidParamClumps;
import org.codehawk.plugin.java.checks.ShotgunSurgery;
import org.codehawk.plugin.java.checks.AvoidInappropriateIntimacy;
import org.codehawk.plugin.java.checks.AvoidLargeClass;
import org.codehawk.plugin.java.checks.AvoidLazyClass;
import org.codehawk.plugin.java.checks.AvoidMemberClumps;
import org.codehawk.plugin.java.checks.AvoidPrimitiveObsession;
import org.codehawk.plugin.java.checks.AvoidUnnecessaryAbstraction;
import org.sonar.plugins.java.api.JavaCheck;
import org.codehawk.plugin.java.checks.RefusedBequest;

public final class RulesList {

  private RulesList() {
  }

  public static List<Class<? extends JavaCheck>> getChecks() {
    List<Class<? extends JavaCheck>> checks = new ArrayList<>();
    checks.addAll(getJavaChecks());
    checks.addAll(getJavaTestChecks());
    return Collections.unmodifiableList(checks);
  }

  public static List<Class<? extends JavaCheck>> getJavaChecks() {
    return Collections.unmodifiableList(Arrays.asList(AvoidLargeClass.class, RefusedBequest.class, AvoidLazyClass.class,
        AvoidParamClumps.class, AvoidMemberClumps.class, ShotgunSurgery.class, AvoidInappropriateIntimacy.class,
        AvoidPrimitiveObsession.class, AvoidUnnecessaryAbstraction.class));
  }

  public static List<Class<? extends JavaCheck>> getJavaTestChecks() {
    return Collections.emptyList();
  }
}
