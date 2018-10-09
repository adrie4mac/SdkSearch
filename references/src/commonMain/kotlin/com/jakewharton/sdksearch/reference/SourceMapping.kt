package com.jakewharton.sdksearch.reference

import com.jakewharton.sdksearch.reference.SourceProject.BASE
import com.jakewharton.sdksearch.reference.SourceProject.CAR
import com.jakewharton.sdksearch.reference.SourceProject.DATABINDING
import com.jakewharton.sdksearch.reference.SourceProject.ICU
import com.jakewharton.sdksearch.reference.SourceProject.LIBCORE
import com.jakewharton.sdksearch.reference.SourceProject.SUPPORT
import com.jakewharton.sdksearch.reference.SourceProject.TELEPHONY
import com.jakewharton.sdksearch.reference.SourceProject.VOIP

internal val SOURCE_MAP = mapOf(
    "android" to BASE.path("core/java/"),
    "android.Manifest" to null,

    // TODO parse jetifier CSV mapping to point to AndroidX sources of these types.
    "android.arch" to null,
    "android.support" to null,

    "android.databinding" to DATABINDING.path("extensions/library/src/main/java/").branch("studio-master-dev"),
    "android.databinding.Bindable" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),
    "android.databinding.BindingAdapter" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),
    "android.databinding.BindingConversion" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),
    "android.databinding.BindingMethod" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),
    "android.databinding.BindingMethods" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),
    "android.databinding.CallbackRegistry" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),
    "android.databinding.InverseBindingAdapter" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),
    "android.databinding.InverseBindingListener" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),
    "android.databinding.InverseBindingMethod" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),
    "android.databinding.InverseBindingMethods" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),
    "android.databinding.Observable" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),
    "android.databinding.ObservableList" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),
    "android.databinding.ObservableMap" to DATABINDING.path("baseLibrary/src/main/java/").branch("studio-master-dev"),

    "android.car" to CAR.path("car-lib/src/"),
    "android.drm" to BASE.path("drm/java/"),
    "android.drm.mobile1" to BASE.path("media/java/"),
    "android.renderscript" to BASE.path("rs/java/"),
    "android.graphics" to BASE.path("graphics/java/"),
    "android.icu" to ICU.path("android_icu4j/src/main/java/"),
    "android.security" to BASE.path("keystore/java/"),
    "android.security.ConfirmationAlreadyPresentingException" to BASE.path("core/java/"),
    "android.security.ConfirmationCallback" to BASE.path("core/java/"),
    "android.security.ConfirmationNotAvailableException" to BASE.path("core/java/"),
    "android.security.ConfirmationPrompt" to BASE.path("core/java/"),
    "android.security.NetworkSecurityPolicy" to BASE.path("core/java/"),
    "android.system" to LIBCORE.path("luni/src/main/java/"),
    "android.location" to BASE.path("location/java/"),
    "android.media" to BASE.path("media/java/"),
    "android.media.effect" to BASE.path("media/mca/effect/java/"),
    "android.mtp" to BASE.path("media/java/"),
    "android.net.rtp" to VOIP.path("src/java/"),
    "android.net.sip" to VOIP.path("src/java/"),
    "android.net.wifi" to BASE.path("wifi/java/"),
    "android.opengl" to BASE.path("opengl/java/"),
    "android.provider.Telephony" to BASE.path("telephony/java/"),
    "android.sax" to BASE.path("sax/java/"),
    "android.service.media" to BASE.path("media/java/"),
    "android.service.media.CameraPrewarmService" to BASE.path("core/java/"),
    "android.telecom" to BASE.path("telecomm/java/"),

    "android.telephony" to BASE.path("telephony/java/"),
    "android.telephony.gsm.SmsManager" to TELEPHONY.path("src/java/"),
    "android.telephony.gsm.SmsMessage" to TELEPHONY.path("src/java/"),

    "android.test" to BASE.path("test-runner/src/"),
    "android.test.AndroidTestCase" to BASE.path("test-base/src/"),
    "android.test.FlakyTest" to BASE.path("test-base/src/"),
    "android.test.InstrumentationTestCase" to BASE.path("test-base/src/"),
    "android.test.InstrumentationTestSuite" to BASE.path("test-base/src/"),
    "android.test.PerformanceTestCase" to BASE.path("test-base/src/"),
    "android.test.UiThreadTest" to BASE.path("test-base/src/"),
    "android.test.mock" to BASE.path("test-mock/src/"),
    "android.test.suitebuilder" to BASE.path("test-base/src/"),
    "android.test.suitebuilder.TestMethod" to BASE.path("test-runner/src/"),
    "android.test.suitebuilder.TestSuiteBuilder" to BASE.path("test-runner/src/"),

    "android.view.PixelCopy" to BASE.path("graphics/java/"),

    "androidx.annotation" to SUPPORT.path("annotations/src/main/java/").branch("androidx-master-dev"),
    "androidx.appcompat" to SUPPORT.path("appcompat/src/main/java/").branch("androidx-master-dev"),
    "androidx.arch.core.executor" to SUPPORT.path("arch/core-runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.arch.core.executor.testing" to SUPPORT.path("arch/core-testing/src/main/java/").branch("androidx-master-dev"),
    "androidx.arch.core.util" to SUPPORT.path("arch/core-common/src/main/java/").branch("androidx-master-dev"),
    "androidx.asynclayoutinflater" to SUPPORT.path("asynclayoutinflater/src/main/java/").branch("androidx-master-dev"),
    "androidx.browser" to SUPPORT.path("browser/src/main/java/").branch("androidx-master-dev"),
    "androidx.car" to SUPPORT.path("car/core/src/main/java/").branch("androidx-master-dev"),
    "androidx.cardview" to SUPPORT.path("cardview/src/main/java/").branch("androidx-master-dev"),
    "androidx.collection" to SUPPORT.path("collection/src/main/java/").branch("androidx-master-dev"),
    "androidx.contentpager" to SUPPORT.path("content/src/main/java/").branch("androidx-master-dev"),
    "androidx.coordinatorlayout" to SUPPORT.path("coordinatorlayout/src/main/java/").branch("androidx-master-dev"),
    "androidx.core" to SUPPORT.path("core/src/main/java/").branch("androidx-master-dev"),
    "androidx.cursoradapter" to SUPPORT.path("cursoradapter/src/main/java/").branch("androidx-master-dev"),
    "androidx.customview" to SUPPORT.path("customview/src/main/java/").branch("androidx-master-dev"),
    "androidx.documentfile" to SUPPORT.path("documentfile/src/main/java/").branch("androidx-master-dev"),
    "androidx.drawerlayout" to SUPPORT.path("drawerlayout/src/main/java/").branch("androidx-master-dev"),
    "androidx.dynamicanimation" to SUPPORT.path("dynamic-animation/src/main/java/").branch("androidx-master-dev"),
    "androidx.emoji" to SUPPORT.path("emoji/core/src/main/java/").branch("androidx-master-dev"),
    "androidx.emoji.bundled" to SUPPORT.path("emoji/bundled/src/main/java/").branch("androidx-master-dev"),
    "androidx.emoji.widget.EmojiAppCompatButton" to SUPPORT.path("emoji/appcompat/src/main/java/").branch("androidx-master-dev"),
    "androidx.emoji.widget.EmojiAppCompatEditText" to SUPPORT.path("emoji/appcompat/src/main/java/").branch("androidx-master-dev"),
    "androidx.emoji.widget.EmojiAppCompatTextView" to SUPPORT.path("emoji/appcompat/src/main/java/").branch("androidx-master-dev"),
    "androidx.exifinterface" to SUPPORT.path("exifinterface/src/main/java/").branch("androidx-master-dev"),
    "androidx.fragment" to SUPPORT.path("fragment/src/main/java/").branch("androidx-master-dev"),
    "androidx.gridlayout" to SUPPORT.path("gridlayout/src/main/java/").branch("androidx-master-dev"),
    "androidx.heifwriter" to SUPPORT.path("heifwriter/src/main/java/").branch("androidx-master-dev"),
    "androidx.interpolator" to SUPPORT.path("interpolator/src/main/java/").branch("androidx-master-dev"),
    "androidx.leanback" to SUPPORT.path("leanback/src/main/java/").branch("androidx-master-dev"),
    "androidx.leanback.preference" to SUPPORT.path("leanback-preference/src/main/java/").branch("androidx-master-dev"),
    "androidx.legacy.app.ActionBarDrawerToggle" to SUPPORT.path("legacy/core-ui/src/main/java/").branch("androidx-master-dev"),
    "androidx.legacy.app.ActivityCompat" to SUPPORT.path("legacy/v13/src/main/java/").branch("androidx-master-dev"),
    "androidx.legacy.app.FragmentCompat" to SUPPORT.path("legacy/v13/src/main/java/").branch("androidx-master-dev"),
    "androidx.legacy.app.FragmentPagerAdapter" to SUPPORT.path("legacy/v13/src/main/java/").branch("androidx-master-dev"),
    "androidx.legacy.app.FragmentStatePagerAdapter" to SUPPORT.path("legacy/v13/src/main/java/").branch("androidx-master-dev"),
    "androidx.legacy.app.FragmentTabHost" to SUPPORT.path("legacy/v13/src/main/java/").branch("androidx-master-dev"),
    "androidx.legacy.content.WakefulBroadcastReceiver" to SUPPORT.path("legacy/core-utils/src/main/java/").branch("androidx-master-dev"),
    "androidx.legacy.view.ViewCompat" to SUPPORT.path("legacy/v13/src/main/java/").branch("androidx-master-dev"),
    "androidx.legacy.widget.Space" to SUPPORT.path("legacy/core-ui/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle" to SUPPORT.path("lifecycle/common/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.AndroidViewModel" to SUPPORT.path("lifecycle/viewmodel/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.ComputableLiveData" to SUPPORT.path("lifecycle/livedata/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.DefaultLifecycleObserver" to SUPPORT.path("lifecycle/common-java8/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.LifecycleRegistry" to SUPPORT.path("lifecycle/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.LifecycleRegistryOwner" to SUPPORT.path("lifecycle/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.LifecycleService" to SUPPORT.path("lifecycle/service/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.LiveData" to SUPPORT.path("lifecycle/livedata-core/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.LiveDataReactiveStreams" to SUPPORT.path("lifecycle/reactivestreams/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.MediatorLiveData" to SUPPORT.path("lifecycle/livedata/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.MutableLiveData" to SUPPORT.path("lifecycle/livedata-core/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.Observer" to SUPPORT.path("lifecycle/livedata-core/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.ProcessLifecycleOwner" to SUPPORT.path("lifecycle/process/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.ServiceLifecycleDispatcher" to SUPPORT.path("lifecycle/service/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.Transformations" to SUPPORT.path("lifecycle/livedata/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.ViewModel" to SUPPORT.path("lifecycle/viewmodel/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.ViewModelProvider" to SUPPORT.path("lifecycle/viewmodel/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.ViewModelProviders" to SUPPORT.path("lifecycle/extensions/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.ViewModelStore" to SUPPORT.path("lifecycle/viewmodel/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.ViewModelStoreOwner" to SUPPORT.path("lifecycle/viewmodel/src/main/java/").branch("androidx-master-dev"),
    "androidx.lifecycle.ViewModelStores" to SUPPORT.path("lifecycle/extensions/src/main/java/").branch("androidx-master-dev"),
    "androidx.loader" to SUPPORT.path("loader/src/main/java/").branch("androidx-master-dev"),
    "androidx.localbroadcastmanager" to SUPPORT.path("localbroadcastmanager/src/main/java/").branch("androidx-master-dev"),
    "androidx.media" to SUPPORT.path("media/src/main/java/").branch("androidx-master-dev"),
    "androidx.media2" to SUPPORT.path("media2/src/main/java/").branch("androidx-master-dev"),
    "androidx.mediarouter" to SUPPORT.path("mediarouter/src/main/java/").branch("androidx-master-dev"),
    "androidx.navigation" to SUPPORT.path("navigation/common/src/main/java/").branch("androidx-master-dev"),
    "androidx.navigation.ActivityNavigator" to SUPPORT.path("navigation/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.navigation.NavController" to SUPPORT.path("navigation/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.navigation.NavDeepLinkBuilder" to SUPPORT.path("navigation/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.navigation.NavHost" to SUPPORT.path("navigation/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.navigation.NavInflater" to SUPPORT.path("navigation/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.navigation.Navigation" to SUPPORT.path("navigation/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.navigation.fragment" to SUPPORT.path("navigation/fragment/src/main/java/").branch("androidx-master-dev"),
    "androidx.navigation.testing" to SUPPORT.path("navigation/testing/src/main/java/").branch("androidx-master-dev"),
    "androidx.navigation.ui" to SUPPORT.path("navigation/ui/src/main/java/").branch("androidx-master-dev"),
    "androidx.paging" to SUPPORT.path("paging/common/src/main/java/").branch("androidx-master-dev"),
    "androidx.paging.AsyncPagedListDiffer" to SUPPORT.path("paging/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.paging.LivePagedListBuilder" to SUPPORT.path("paging/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.paging.PagedListAdapter" to SUPPORT.path("paging/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.paging.RxPagedListBuilder" to SUPPORT.path("paging/rxjava2/src/main/java/").branch("androidx-master-dev"),
    "androidx.palette" to SUPPORT.path("palette/src/main/java/").branch("androidx-master-dev"),
    "androidx.percentlayout" to SUPPORT.path("percent/src/main/java/").branch("androidx-master-dev"),
    "androidx.preference" to SUPPORT.path("preference/src/main/java/").branch("androidx-master-dev"),
    "androidx.print" to SUPPORT.path("print/src/main/java/").branch("androidx-master-dev"),
    "androidx.recommendation" to SUPPORT.path("recommendation/src/main/java/").branch("androidx-master-dev"),
    "androidx.recyclerview" to SUPPORT.path("recyclerview/recyclerview/src/main/java/").branch("androidx-master-dev"),
    "androidx.recyclerview.selection" to SUPPORT.path("recyclerview/selection/src/main/java/").branch("androidx-master-dev"),
    "androidx.room" to SUPPORT.path("room/common/src/main/java/").branch("androidx-master-dev"),
    "androidx.room.DatabaseConfiguration" to SUPPORT.path("room/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.room.EmptyResultSetException" to SUPPORT.path("room/rxjava2/src/main/java/").branch("androidx-master-dev"),
    "androidx.room.InvalidationTracker" to SUPPORT.path("room/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.room.Room" to SUPPORT.path("room/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.room.RoomDatabase" to SUPPORT.path("room/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.room.RxRoom" to SUPPORT.path("room/rxjava2/src/main/java/").branch("androidx-master-dev"),
    "androidx.room.migration" to SUPPORT.path("room/runtime/src/main/java/").branch("androidx-master-dev"),
    "androidx.room.testing" to SUPPORT.path("room/testing/src/main/java/").branch("androidx-master-dev"),
    "androidx.slice" to SUPPORT.path("slices/core/src/main/java/").branch("androidx-master-dev"),
    "androidx.slice.SliceMetadata" to SUPPORT.path("slices/view/src/main/java/").branch("androidx-master-dev"),
    "androidx.slice.SliceStructure" to SUPPORT.path("slices/view/src/main/java/").branch("androidx-master-dev"),
    "androidx.slice.SliceUtils" to SUPPORT.path("slices/view/src/main/java/").branch("androidx-master-dev"),
    "androidx.slice.SliceViewManager" to SUPPORT.path("slices/view/src/main/java/").branch("androidx-master-dev"),
    "androidx.slice.builders" to SUPPORT.path("slices/builders/src/main/java/").branch("androidx-master-dev"),
    "androidx.slice.widget" to SUPPORT.path("slices/view/src/main/java/").branch("androidx-master-dev"),
    "androidx.slidingpanelayout" to SUPPORT.path("slidingpanelayout/src/main/java/").branch("androidx-master-dev"),
    "androidx.sqlite.db" to SUPPORT.path("persistence/db/src/main/java/").branch("androidx-master-dev"),
    "androidx.sqlite.db.framework" to SUPPORT.path("persistence/db-framework/src/main/java/").branch("androidx-master-dev"),
    "androidx.swiperefreshlayout" to SUPPORT.path("swiperefreshlayout/src/main/java/").branch("androidx-master-dev"),
    "androidx.transition" to SUPPORT.path("transition/src/main/java/").branch("androidx-master-dev"),
    "androidx.tvprovider" to SUPPORT.path("tv-provider/src/main/java/").branch("androidx-master-dev"),
    "androidx.vectordrawable" to SUPPORT.path("graphics/drawable/static/src/main/java/").branch("androidx-master-dev"),
    "androidx.vectordrawable.graphics.drawable.Animatable2Compat" to SUPPORT.path("graphics/drawable/animated/src/main/java/").branch("androidx-master-dev"),
    "androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat" to SUPPORT.path("graphics/drawable/animated/src/main/java/").branch("androidx-master-dev"),
    "androidx.viewpager" to SUPPORT.path("viewpager/src/main/java/").branch("androidx-master-dev"),
    "androidx.wear" to SUPPORT.path("wear/src/main/java/").branch("androidx-master-dev"),
    "androidx.webkit" to SUPPORT.path("webkit/src/main/java/").branch("androidx-master-dev"),
    "androidx.work" to SUPPORT.path("work/workmanager/src/main/java/").branch("androidx-master-dev"),
    "androidx.work.test" to SUPPORT.path("work/workmanager-test/src/main/java/").branch("androidx-master-dev"),

    "dalvik" to LIBCORE.path("dalvik/src/main/java/"),

    "java" to LIBCORE.path("ojluni/src/main/java/"),
    "java.math" to LIBCORE.path("luni/src/main/java/"),

    "javax" to LIBCORE.path("ojluni/src/main/java/"),
    "javax.microedition" to BASE.path("opengl/java/"),
    "javax.xml" to LIBCORE.path("luni/src/main/java/"),

    "junit" to BASE.path("test-base/src/"),
    "junit.runner" to BASE.path("test-runner/src/"),
    "junit.textui" to BASE.path("test-runner/src/"),

    "org" to LIBCORE.path("luni/src/main/java/"),
    "org.json" to LIBCORE.path("json/src/main/java/"),
    "org.xmlpull" to LIBCORE.path("xml/src/main/java/"),
    "org.apache.http" to BASE.path("core/java/")
)