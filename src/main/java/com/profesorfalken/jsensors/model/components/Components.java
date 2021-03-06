/*
 * Copyright 2016-2017 Javier Garcia Alonso.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.profesorfalken.jsensors.model.components;

import java.util.List;

/**
 *
 * @author Javier Garcia Alonso
 */
public class Components {
	public final List<Cpu> cpus;
	public final List<Gpu> gpus;
	public final List<Disk> disks;

	public Components(List<Cpu> cpus, List<Gpu> gpus, List<Disk> disks) {
		this.cpus = cpus;
		this.gpus = gpus;
		this.disks = disks;
	}
}
