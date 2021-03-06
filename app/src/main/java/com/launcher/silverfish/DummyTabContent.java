
/*
 * Copyright 2016 Stanislav Pintjuk
 * E-mail: stanislav.pintjuk@gmail.com
 *
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.launcher.silverfish;

import android.content.Context;
import android.view.View;
import android.widget.TabHost;

public class DummyTabContent implements TabHost.TabContentFactory {
    private Context mContext;

    public DummyTabContent(Context context) {
        mContext = context;
    }

    @Override
    public View createTabContent(String tag) {
        View v = new View(mContext);
        return v;
    }
}
