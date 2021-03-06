/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._636;

import org.mapstruct.Mapper;

@Mapper
public interface SourceTargetBaseMapper {

    default Foo fooFromId(long id) {
        return new Foo(id);
    }

    static Bar barFromId(String id) {
        return new Bar(id);
    }
}
