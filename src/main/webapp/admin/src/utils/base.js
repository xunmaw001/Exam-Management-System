const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm3sjh8/",
            name: "ssm3sjh8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm3sjh8/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "考试管理系统"
        } 
    }
}
export default base
