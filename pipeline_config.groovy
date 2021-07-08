libraries{
  maven {
    version = "3.2.3"
  }
  ansible
}

application_environments{
  dev {
      long_name = "dev.app.maven"
   }
  prod {
      long_name = "prod.app.maven"
   }

}
