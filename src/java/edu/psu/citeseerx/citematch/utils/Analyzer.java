/*
 * Copyright 2007 Penn State University
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.psu.citeseerx.citematch.utils;

/**
 * Interface for citation text analyzers.
 *
 * @author Isaac Councill
 * @version $Rev$ $Date$
 */
public interface Analyzer {

    /**
     * Implementing classes should return a normalized version of the
     * specified String.
     * @param s
     * @return a normalized version of the specified String.
     */
    public String analyze(String s);
    
} //- Interface Analyzer
