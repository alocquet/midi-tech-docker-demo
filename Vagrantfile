Vagrant.configure(2) do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.synced_folder ".", "/home/vagrant/project"
  config.vm.network "private_network", ip: "192.168.10.11"

  config.vm.provider :virtualbox do |vb|
    vb.customize ["setextradata", :id, "VBoxInternal2/SharedFoldersEnableSymlinksCreate/.", "1"]
  end

  config.vm.provision "shell", inline: <<-SHELL
      # update APT repositories before installing anything else
      sudo apt-get update

      # install node & npm
      sudo apt-get install -y docker.io
      # Add vagrant user to docker group
      usermod -a -G docker vagrant
    SHELL
end
