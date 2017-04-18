package co.zsmb.materialdrawerkt.builders

import co.zsmb.materialdrawerkt.DrawerMarker
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem

@DrawerMarker
abstract class BuilderBase {

    internal abstract fun attachItem(item: IDrawerItem<*, *>)

}