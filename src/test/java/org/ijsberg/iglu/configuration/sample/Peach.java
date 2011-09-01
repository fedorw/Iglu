/*
 * Copyright 2011 Jeroen Meetsma
 *
 *
 * This file is part of Iglu.
 *
 * Iglu is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Iglu is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.ijsberg.iglu.configuration.sample;

import java.util.Properties;

public class Peach implements PeachInterface {

	String color;

	public void setProperties(Properties properties) {
		color = properties.getProperty("color", "green");
	}

	public String getColor() {
		return color;
	}

	public Integer setTaste(int taste) {
		return taste;
	}

	public String setTaste(String taste) {
		return taste;
	}

	public String setTaste(String taste, int factor) {
		return taste + factor;
	}
}
