/*
 * Copyright 2017 the original author or authors.
 *
 * This file is part of the JHipster project, see https://jhipster.github.io/
 * for more information.
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

package io.github.jhipster.service.filter;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * Filter class for {@link LocalDate} type attributes.
 *
 * @see RangeFilter
 */
public class LocalDateFilter extends RangeFilter<LocalDate> {

    @Override
    @DateTimeFormat(iso = ISO.DATE)
    public void setEquals(LocalDate equals) {
        super.setEquals(equals);
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE)
    public void setGreaterThan(LocalDate equals) {
        super.setGreaterThan(equals);
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE)
    public void setGreaterOrEqualThan(LocalDate equals) {
        super.setGreaterOrEqualThan(equals);
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE)
    public void setLessThan(LocalDate equals) {
        super.setLessThan(equals);
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE)
    public void setLessOrEqualThan(LocalDate equals) {
        super.setLessOrEqualThan(equals);
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE)
    public void setIn(List<LocalDate> in) {
        super.setIn(in);
    }

}
