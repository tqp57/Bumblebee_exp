package com.example.banner.Data

class DataBean {
    var imageRes: Int? = null
    var imageUrl: String? = null
    var title: String?
    var viewType: Int

    constructor(imageRes: Int?, title: String?, viewType: Int) {
        this.imageRes = imageRes
        this.title = title
        this.viewType = viewType
    }

    constructor(imageUrl: String?, title: String?, viewType: Int) {
        this.imageUrl = imageUrl
        this.title = title
        this.viewType = viewType
    }

    companion object {
        val testData3: List<DataBean>
            get() {
                val list: MutableList<DataBean> = ArrayList()
                list.add(
                    DataBean(
                        "https://wx1.sinaimg.cn/mw2000/8af7d7ffly1grrc56zxm0j21sc1scx6p.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://wx2.sinaimg.cn/mw2000/8af7d7ffly1gkr6lfhfzzj21g81lp1kx.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://wx2.sinaimg.cn/mw2000/8af7d7ffly1g62urqu768j22c0340qv6.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://wx4.sinaimg.cn/orj360/006KuGfply1h0co6wwo75j30si120tg6.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://wx3.sinaimg.cn/mw2000/002xMJgrgy1gvhh1k6kqtj61yw1ywqv502.jpg",
                        null,
                        1
                    )
                )
                return list
            }
    }
}