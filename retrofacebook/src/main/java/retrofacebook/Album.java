/*
 * Copyright (C) 2015 8tory, Inc.
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
package retrofacebook;

import auto.json.AutoJson;
import android.support.annotation.Nullable;
import android.os.Bundle;

/**
 * <pre>
 * {
 *   "id": "10152728596854xxx",
 *   "can_upload": true,
 *   "count": 2,
 *   "cover_photo": 10152728596979xxx,
 *   "created_time": 2014-12-31T10:39:08+0000,
 *   "from": {
 *     "id": "10152246635994118",
 *     "name": Andrew Chen
 *   },
 *   "link": https://www.facebook.com/album.php?fbid=10152728596854xxx&id=10152246635994xxx&aid=1073741xxx,
 *   "name": 2014/12/31 TICC,
 *   "privacy": custom,
 *   "type": normal,
 *   "updated_time": 2014-12-31T11:14:07+0000
 * }
 * </pre>
 * @see https://developers.facebook.com/docs/graph-api/reference/v2.3/album
 */
@AutoJson
public abstract class Album {
    @Nullable
    @AutoJson.Field
    public abstract String id();
    @Nullable
    @AutoJson.Field
    public abstract String name();
    @Nullable
    @AutoJson.Field
    public abstract User from();

    @AutoJson.Builder
    public abstract static class Builder {
        public abstract Builder id(String x);
        public abstract Builder name(String x);
        public abstract Builder from(User x);
        public abstract Album build();
    }

    public static Builder builder() {
        return new AutoJson_Album.Builder();
    }

    public abstract Bundle toBundle();
}
